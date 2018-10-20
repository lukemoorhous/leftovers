#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_tmg1_test2_Page1_string1FromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_tmg1_test2_Page1_Yes(
        JNIEnv* env,
jobject /* this */) {
std::string hello = "Yes";
return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_tmg1_test2_Page1_No(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "No";
    return env->NewStringUTF(hello.c_str());
}



