require conf/machine/include/ti-soc.inc
SOC_FAMILY:append = ":omapl138_aesd_proj"

require conf/machine/include/arm/armv5/tune-arm926ejs.inc

KERNEL_IMAGETYPE = "uImage"

#PREFERRED_PROVIDER_virtual/kernel ?= "linux-ti-staging"
PREFERRED_PROVIDER_virtual/kernel ?= "linux-ti-aesd-proj"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-ti-staging"
PREFERRED_PROVIDER_u-boot = "u-boot-ti-staging"

EXTRA_IMAGEDEPENDS += "virtual/bootloader"

MACHINE_FEATURES = "kernel26 serial ethernet usbhost usbgadget mmc alsa"
