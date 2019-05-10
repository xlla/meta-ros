# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Common rviz API, used by rviz plugins and applications."
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Dave Hershberger"
HOMEPAGE = "https://github.com/ros2/rviz/blob/ros2/README.md"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rviz"
ROS_BPN = "rviz_common"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rviz-assimp-vendor \
    rviz-ogre-vendor \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rviz-assimp-vendor \
    rviz-ogre-vendor \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rviz-ogre-vendor \
    rviz-rendering \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/dashing/rviz_common/6.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f80f8dd889d2295e0f14e5de8a2344ba"
SRC_URI[sha256sum] = "e3ed90f5e92bfc4c9cda55053dcbfd520b15359e5a199ee4b289c90baa9ddce0"
S = "${WORKDIR}/rviz-release-release-dashing-rviz_common-6.1.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rviz', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rviz', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rviz/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}