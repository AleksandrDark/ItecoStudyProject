package com.iteco.collection;

public enum Subject {
    HISTORY("история"),
    ENGLISH("английский"),
    RUSSIAN("русский"),
    LITERATURE("литература"),
    MATH("математика"),
    PHYSICS("физика");

    public final String value;


    Subject(String value) {
        this.value = value;
    }

    public static Subject getValue(String value){
        for (Subject subject: values()){
            if (subject.value.equals(value)){
                return subject;
            }
        }
        return null;
    }
}
