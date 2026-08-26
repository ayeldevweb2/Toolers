/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toolkit.toolers.pojo;

/**
 *
 * @author Ariel
 */
public class RepoProgress {
    
    private String task;
    private int initialValue;
    private int totalValue;
    private boolean is_completed;
    
    
    public RepoProgress(String task, int initialValue, int totalValue, boolean is_completed){
        this.task = task;
        this.initialValue = initialValue;
        this.totalValue = totalValue;
        this.is_completed = is_completed;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }

    @Override
    public String toString() {
        return "RepoProgress{" + "task=" + task + ", initialValue=" + initialValue + ", totalValue=" + totalValue + ", is_completed=" + is_completed + '}';
    }
    
}
