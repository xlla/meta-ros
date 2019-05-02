# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This metapackage depends on packages for interfacing common     joysticks and human input devices with ROS."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
HOMEPAGE = "http://www.ros.org/wiki/joystick_drivers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "joystick_drivers"
ROS_BPN = "joystick_drivers"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joy \
    ps3joy \
    spacenav-node \
    wiimote \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joystick_drivers/1.13.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0bb8390418a3c9d963dfee25164985a2"
SRC_URI[sha256sum] = "40f5d279303bcca1d36d8c540ebb8b57a67269d7bca43fe7db89c400f3edb9b8"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-joystick_drivers-1.13.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('joystick-drivers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('joystick-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/joystick-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}