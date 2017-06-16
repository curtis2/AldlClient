// IMyService.aidl
package com.simon.ipc.aidlserver;

import com.simon.ipc.aidlserver.Student;
// Declare any non-default types here with import statements

interface IMyService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
     List<Student> getStudent();
     void addStudent(in Student student);
}
