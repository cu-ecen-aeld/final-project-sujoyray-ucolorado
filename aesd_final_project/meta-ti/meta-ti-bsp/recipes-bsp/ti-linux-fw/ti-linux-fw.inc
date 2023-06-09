SUMMARY = "TI SCI firmware (SYSFW)"

LICENSE = "TI-TFL"
LIC_FILES_CHKSUM = "file://LICENSE.ti;md5=b5aebf0668bdf95621259288c4a46d76"

PV = "2022.01"
INC_PR = "r4"

# Firmware versions
CORESDK_RTOS_VERSION = "08.02.00.04"
PRUETH_FW_AM65X_VERSION = "08.00.00.20"
PRUETH_FW_AM65X_SR2_VERSION = "02.02.11.02"
GOODIX_FW_VERSION = "1.0.0.0"
CADENCE_MHDP_FW_VERSION = "2.1.0"
IMG_DEC_FW_VERSION = "1.0"
CNM_WAVE521_FW_VERSION = "1.0.00"
TIFS_LPM_STUB_FW_VERSION = "08.06.04"

TI_LINUX_FW_SRCREV ?= "79c498ef6ab1558b699a2243a26c4a65a1c44d26"
SRCREV = "${TI_LINUX_FW_SRCREV}"

BRANCH ?= "ti-linux-firmware"

K3_IMAGE_GEN_SRCREV ?= "1319f46f3899e62d88e0a5cedad5b454d0432ddb"
SRCREV_imggen = "${K3_IMAGE_GEN_SRCREV}"
SRCREV_FORMAT = "imggen"

K3_IMAGE_GEN_BRANCH ?= "master"

SRC_URI = " \
	git://git.ti.com/git/processor-firmware/ti-linux-firmware.git;protocol=https;branch=${BRANCH} \
	git://git.ti.com/git/k3-image-gen/k3-image-gen.git;protocol=https;branch=${K3_IMAGE_GEN_BRANCH};destsuffix=imggen;name=imggen \
"

S = "${WORKDIR}/git"
