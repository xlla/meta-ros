# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ros_tutorials contains packages that demonstrate various features of ROS,     as well as support packages which help demonstrate those features."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust"
HOMEPAGE = "http://www.ros.org/wiki/ros_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_tutorials"
ROS_BPN = "ros_tutorials"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp-tutorials \
    rospy-tutorials \
    turtlesim \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp-tutorials \
    rospy-tutorials \
    turtlesim \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/melodic/ros_tutorials/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9569069b61bcf0fdce8b17d1707f7dad"
SRC_URI[sha256sum] = "566f9e87ffd41023bf48a504e928de4e837676cfade117ef7c208c89e352fa4a"
S = "${WORKDIR}/ros_tutorials-release-release-melodic-ros_tutorials-0.9.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-tutorials', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-tutorials', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-tutorials/ros-tutorials_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-tutorials/ros-tutorials-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-tutorials/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-tutorials/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}