# Copyright (c) 2019 LG Electronics, Inc.

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
    file://fix.apriltag.include.flag.patch \
"