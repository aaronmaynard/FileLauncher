/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.launcher;

import java.io.File;

/**
 *
 * @author Aaron Maynard
 */
public class Applications {
    private String NAME, DIRECTORY, SIZE;
    private long SIZEINBYTES;
    
    public void Applications(String name, String dir, String size, long bytes){
        this.NAME = name;
        this.DIRECTORY = dir;
        this.SIZE = size;
        this.SIZEINBYTES = bytes;
    }
    
    // Getters
    public String getName(){
        return NAME;
    }
    public String getDir(){
        return DIRECTORY;
    }
    public String getSize(){
        return SIZE;
    }
    public long getSizeBits(){
        return SIZEINBYTES;
    }
    
    // Setters
    public void setName(String path){
        File f = new File(path);
        this.NAME = f.getName();
    }
    public void setDir(String path){
        File f = new File(path);
        this.DIRECTORY = f.getAbsolutePath();
    }
    public void setSize(String path){
        String size = null;
        long bytes, kb, mb;
        File f = new File(path);
        bytes = f.length();
        this.SIZEINBYTES = bytes;
        kb = bytes / 1024;
        mb = kb / 1024;
        
        size = String.valueOf(bytes)  + " bytes";
        if(bytes > 100000){
            // Set size to kb
            size = String.valueOf(kb)  + " kb";
        }
        if(kb > 100000){
            // Set size to mb
            size = String.valueOf(mb) + " mb";
        }
        
        this.SIZE = size;
    }
}
