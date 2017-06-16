package com.simon.ipc.aidlserver;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Locale;

/**
 * auther: elliott zhang
 * Emaill:18292967668@163.com
 */

public class Student implements Parcelable {
    public static final int SEX_MALE = 1;
    public static final int SEX_FEMALE = 2;
    public int sno;
    public String name;
    public int sex;
    public int age;
    protected Student() {
    }
    protected Student(Parcel in) {
        readFromParcel(in);
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(sno);
        dest.writeString(name);
        dest.writeInt(sex);
        dest.writeInt(age);
    }

    public void readFromParcel(Parcel in) {
        sno = in.readInt();
        name = in.readString();
        sex = in.readInt();
        age = in.readInt();
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "Student[ %d, %s, %d, %d ]", sno, name, sex, age);
    }
}
