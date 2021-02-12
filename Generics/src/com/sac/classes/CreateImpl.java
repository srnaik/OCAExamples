package com.sac.classes;

public class CreateImpl {

    public static void main(String[] args) {

        Create<Elephant> create = new Create<>();
        Elephant originalElephant = new Elephant();
        originalElephant.setName("Sachin");
        create.createContents(originalElephant);

        Elephant copiedElephant = create.emptyCreate();
        System.out.println("Name of the copied Elephant: "+ copiedElephant.getName());

        Create<String> strCreate = new Create<>();
        strCreate.createContents("San Jose");
        String copiedString = strCreate.emptyCreate();
        System.out.println("Copied String: " + copiedString);
    }
}
