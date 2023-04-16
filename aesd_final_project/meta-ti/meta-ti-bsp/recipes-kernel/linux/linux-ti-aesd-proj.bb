SECTION = "kernel"
SUMMARY = "Linux kernel for TI devices"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

#LINUX_VERSION ?= "5.6"
LINUX_VERSION ?= "5.10"
inherit kernel
require recipes-kernel/linux/linux-yocto.inc

DEPENDS += "gmp-native libmpc-native"
KEEPUIMAGE  = "no"
COMPRESS_IMAGE = "none"

# Look in the generic major.minor directory for files
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-5.10:"
#BRANCH = "ti-linux-5.10.y"
#SRCREV = "8b51d20b6e6e1b9277b59b7aaed8a97eff43097f"
#PV = "5.10.145+git${SRCPV}"
#KERNEL_GIT_URI = "git://git.ti.com/git/ti-linux-kernel/ti-linux-kernel.git"
#KERNEL_GIT_PROTOCOL = "https"

KERNEL_DEFCONFIG = "aesd_defconfig"

#git:////home/sujoyray/OpenBMC/OpenBMC/linux_kernel_without_patch/linux_aspeed
#/home/sujoy/master-studies/linux_uboot/Linux_5.6_Kernel

#BRANCH = "aesd_project"
#SRCREV = "d904760fcc672b09c19989ad25a007292d19800f"
#PV = "5.6.0+git${SRCPV}"
#KERNEL_GIT_URI = "git:////home/sujoy/master-studies/linux_uboot/Linux_5.6_Kernel"
#KERNEL_GIT_PROTOCOL = "file"

BRANCH = "5.10.y_branch"
SRCREV = "c1991548c4f715df1f5c013f27e7222014e2f2dc"
PV = "5.10.177+git${SRCPV}"
KERNEL_GIT_URI = "git:////home/sujoy/master-studies/linux_uboot/Linux_5.10.177"
KERNEL_GIT_PROTOCOL = "file"



SRC_URI += "${KERNEL_GIT_URI};protocol=${KERNEL_GIT_PROTOCOL};branch=${BRANCH} \
            file://aesd_defconfig"

FILES:${KERNEL_PACKAGE_NAME}-devicetree += "/${KERNEL_IMAGEDEST}/*.itb"


#do_install:append() {
#    mkimage -A arm -O linux -T kernel -C none -a 0xc0008000 -e 0xc0008000 -n "Linux kernel" -d ${D}/boot/zImage-5.6.0-yocto-standard ${D}/boot/uImage-uncompressed
#}

#do_install:append() {
#mkimage -A arm -O linux -T kernel -C gzip -a 0x80008000 -e 0x80008000 -d ${D}/boot/uImage-5.6.0-yocto-standard  ${D}/boot/uncompressed-image
#}
