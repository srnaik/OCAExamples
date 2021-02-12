package com.sac.classes;

public class Create<T> {

    private T contents;

    public T emptyCreate(){
        return contents;
    }

    public void createContents(T contents){
        this.contents = contents;
    }
}
