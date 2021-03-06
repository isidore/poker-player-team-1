#!/usr/bin/env bash

JAVA_OPTS="$JAVA_OPTS -Xmx248m"
JAVA_OPTS="$JAVA_OPTS -XX:-UseGCOverheadLimit"
JAVA_OPTS="$JAVA_OPTS -XX:+UseCompressedOops"
JAVA_OPTS="$JAVA_OPTS -XX:+UseCompressedClassPointers"

exec ./gradlew --no-daemon run
