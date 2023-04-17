SECTION = "kernel"
SUMMARY = "Linux kernel for TI devices"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"


LINUX_VERSION ?= "5.10"
inherit kernel
require recipes-kernel/linux/linux-yocto.inc

DEPENDS += "gmp-native libmpc-native"
KEEPUIMAGE  = "no"
COMPRESS_IMAGE = "none"

# Look in the generic major.minor directory for files
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-5.10:"

KERNEL_DEFCONFIG = "aesd_defconfig"

PV = "5.10.177+git${SRCPV}"

BRANCH = "main"
KERNEL_GIT_URI = "git://git@github.com/sujoyray-ucolorado/final-project-assignment-sujoyray.git"
KERNEL_GIT_PROTOCOL= "https"
SRCREV = "ec26c5758dd3616ae5dfa852b0ca652f6baddbf1"

SRC_URI += "${KERNEL_GIT_URI};protocol=${KERNEL_GIT_PROTOCOL};branch=${BRANCH} \
            file://aesd_defconfig"

FILES:${KERNEL_PACKAGE_NAME}-devicetree += "/${KERNEL_IMAGEDEST}/*.itb"


#do_install:append() {
#    mkimage -A arm -O linux -T kernel -C none -a 0xc0008000 -e 0xc0008000 -n "Linux kernel" -d ${D}/boot/zImage-5.6.0-yocto-standard ${D}/boot/uImage-uncompressed
#}

#do_install:append() {
#mkimage -A arm -O linux -T kernel -C gzip -a 0x80008000 -e 0x80008000 -d ${D}/boot/uImage-5.6.0-yocto-standard  ${D}/boot/uncompressed-image
#}
