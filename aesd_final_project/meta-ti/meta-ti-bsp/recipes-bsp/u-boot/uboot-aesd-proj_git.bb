require u-boot-ti.inc

LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

PR = "r0"

PV = "2020.04"

# For the un-initiated:
# The actual URL you'd use with a git clone for example would be:
# https://source.denx.de/u-boot/u-boot.git/
# However, in the context of OE, we have to explicitly split things up:
# a) we want it to use git fetcher - hence git:// prefix in GIT_URI (if we
#  used https here, we'd endup attempting wget instead of git)
# b) and we want git fetcher to use https protocol, hence GIT_PROTOCOL as https
UBOOT_GIT_URI = "git:////home/sujoy/master-studies/linux_uboot/uboot-2020.04-rc3-test"
UBOOT_GIT_PROTOCOL = "file"
SRCREV = "a48b6f2ecb8020a6e9437f0c14ca180984d9eaf4"
BRANCH = "u-boot-2020.04-rc3"
