DESCRIPTION = "The modular source code checker: pep8, pyflakes and co"
HOMEPAGE = "https://github.com/dreamhost/cliff"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a76e57e683629e1ac2a49406169c2a3"

SRC_URI[md5sum] = "7e5fe39d578a2c2d0962b61b35b8c3fc"
SRC_URI[sha256sum] = "7253265f7abd8b313e3892944044a365e3f4ac3fcdcfb4298f55ee9ddf188ba0"

inherit setuptools3 pypi

RDEPENDS_${PN} += "${PYTHON_PN}-prettytable \
            ${PYTHON_PN}-cmd2 \
            ${PYTHON_PN}-pyparsing \
            ${PYTHON_PN}-mccabe \
            ${PYTHON_PN}-pep8 \
            ${PYTHON_PN}-pyflakes"