SUMMARY  = "OpenCL API Headers"
DESCRIPTION = "OpenCL compute API headers from Khronos Group"
LICENSE  = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "base"

S = "${WORKDIR}/git"
PV = "2023.02.06"
SRCREV = "4c82e9cfaaad18c340f48af3cf5d09ff33e8c1b7"
SRC_URI = "git://github.com/KhronosGroup/OpenCL-Headers.git;branch=main;protocol=https"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
ALLOW_EMPTY:${PN} = "1"

do_install () {
	install -d ${D}${includedir}/CL/
	install -m 0644 ${S}/CL/*.h ${D}${includedir}/CL
}
BBCLASSEXTEND = "native nativesdk"
