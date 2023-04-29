#!/bin/bash

# Local directory path to copy
local_dir="./test-folder/"


create_test_folder() {
my_drive=$1
echo "Creating folder" $my_drive 
mkdir $my_drive
mkdir $my_drive/test-1 && echo "This is test-1" > $my_drive/test-1/test-1.txt 
mkdir $my_drive/test-2 && echo "This is test-2" > $my_drive/test-2/test-2.txt
mkdir $my_drive/test-3 && echo "This is test-3" > $my_drive/test-3/test-3.txt
}

if [ ! -d $local_dir ] ; then
   create_test_folder $local_dir
fi



# Remote server details
remote_host="192.168.1.88"
remote_user="root"
remote_dir="/mnt/mydrive"

# Copy local directory to remote server
scp -r $local_dir $remote_user@$remote_host:$remote_dir

if [ $? -eq 0 ]; then
  echo "File copied successfully"
fi

