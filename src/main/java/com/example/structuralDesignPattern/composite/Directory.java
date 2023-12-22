package com.example.structuralDesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File{
    private List<File> files = new ArrayList<>();

    public void addFile(File file)
    {
        files.add(file);
    }
    public Directory(long l){

    }

    @Override
    public String getType() {
        return "directory";
    }

    @Override
    public Long getSize() {
        Long size =0L;
        for(File file:files)
        {
            size =size+file.getSize();
        }
        return size;
    }
}
