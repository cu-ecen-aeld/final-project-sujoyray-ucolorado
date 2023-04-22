SUMMARY = "An example of a multilib image"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

#
# This example includes a lib32 version of bash into an otherwise standard
# sato image. It assumes a "lib32" multilib has been enabled in the user's
# configuration (see the example conf files for examples of this.)
#

# First include a base image to base things off

# Now add the multilib packages we want to install
#IMAGE_INSTALL:append = " u-boot-tools-mkimage"
#IMAGE_INSTALL:append = " u-boot-native"
IMAGE_INSTALL:append = " dropbear"

