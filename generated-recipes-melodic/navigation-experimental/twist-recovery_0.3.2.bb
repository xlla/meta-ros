# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A recovery behavior that performs a particular used-defined twist."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Bhaskara Marthi"
HOMEPAGE = "http://wiki.ros.org/twist_recovery"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "twist_recovery"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/twist_recovery/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "19e6cd5456c25c4d5f2b2737053e5f71"
SRC_URI[sha256sum] = "8c67a2c46844a984e92f59e344590deedd9525f2bfc7b3201c6a1e8999c2d881"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-twist_recovery-0.3.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation-experimental', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation-experimental', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/navigation-experimental-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}