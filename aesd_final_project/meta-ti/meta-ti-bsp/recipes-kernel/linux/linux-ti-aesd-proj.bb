SECTION = "kernel"
SUMMARY = "Linux kernel for TI devices"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION ?= "5.10"
inherit kernel
require recipes-kernel/linux/linux-yocto.inc

DEPENDS += "gmp-native libmpc-native"
KEEPUIMAGE  = "no"

# Look in the generic major.minor directory for files
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-5.10:"
BRANCH = "ti-linux-5.10.y"

KERNEL_DEFCONFIG = "aesd_defconfig"


SRCREV = "8b51d20b6e6e1b9277b59b7aaed8a97eff43097f"
PV = "5.10.145+git${SRCPV}"
KERNEL_GIT_URI = "git://git.ti.com/git/ti-linux-kernel/ti-linux-kernel.git"
KERNEL_GIT_PROTOCOL = "https"
SRC_URI += "${KERNEL_GIT_URI};protocol=${KERNEL_GIT_PROTOCOL};branch=${BRANCH} \
            file://aesd_defconfig"

FILES:${KERNEL_PACKAGE_NAME}-devicetree += "/${KERNEL_IMAGEDEST}/*.itb"

