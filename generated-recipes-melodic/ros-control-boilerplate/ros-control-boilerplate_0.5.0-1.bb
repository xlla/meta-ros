# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for ros_control"
AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
ROS_AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
HOMEPAGE = "https://github.com/davetcoleman/ros_control_boilerplate"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_control_boilerplate"
ROS_BPN = "ros_control_boilerplate"

ROS_BUILD_DEPENDS = " \
    actionlib \
    cmake-modules \
    control-msgs \
    control-toolbox \
    controller-manager \
    gflags \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    control-msgs \
    control-toolbox \
    controller-manager \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    control-msgs \
    control-toolbox \
    controller-manager \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/PickNikRobotics/ros_control_boilerplate-release/archive/release/melodic/ros_control_boilerplate/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f02eb52952d192de13f6f6a237cf88e7"
SRC_URI[sha256sum] = "0a7ce80db50a833c0ac201c31caba85ebdc1192a279adcc9b5e61ab86c1b7899"
S = "${WORKDIR}/ros_control_boilerplate-release-release-melodic-ros_control_boilerplate-0.5.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-control-boilerplate', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-control-boilerplate', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control-boilerplate/ros-control-boilerplate_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control-boilerplate/ros-control-boilerplate-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control-boilerplate/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-control-boilerplate/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}