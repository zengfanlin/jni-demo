#include <jni.h>
#include <stdio.h>
#include "com_j_HelloJNI.h"

// Implementation of native method sayHello() of HelloJNI class
JNIEXPORT void JNICALL Java_com_j_HelloJNI_sayHello(JNIEnv *env, jobject thisObj,jint thisint) {
   printf("Hello World!\n");
   int a= 1/thisint;

   return;
}