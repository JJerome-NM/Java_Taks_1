package com.string_editor;


import com.string_lib.StringController;

import java.util.ArrayList;

public class StringEditor {
  public static void main(String[] args) {
    System.out.println(StringController.findUniqueChars("Fsdfd/./,.fsg", "dijm8dsfiju", " s.. .,, ,23dkf9sdhgfsd"));

    System.out.println(StringController.findUniqueChars(new ArrayList<>(){
      {
        add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        add("Pellentesque habitant morbi tristique senectus et netus.");
        add("Class aptent taciti sociosqu ad litora torquent.");
        add("Etiam in ante dolor. Curabitur id congue.");
      }
    }));
  }
}
