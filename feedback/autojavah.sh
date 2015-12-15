#!/bin/sh
export ProjectPath=$(cd "../$(dirname "$1")"; pwd)
export TargetClassName="com.mumaoxi.fb.UninstallFB"

export SourceFile="${ProjectPath}/feedback/src/main/java"
export TargetPath="${ProjectPath}/feedback/src/main/jni"

cd "${SourceFile}"
javah -d "${TargetPath}" -classpath "${SourceFile}" "${TargetClassName}"
echo -d "${TargetPath}" -classpath "${SourceFile}" "${TargetClassName}"