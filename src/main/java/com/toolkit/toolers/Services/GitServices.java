/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toolkit.toolers.Services;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.toolkit.toolers.pojo.RepoProgress;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.io.File;
import java.sql.Array;
import org.eclipse.jgit.lib.ProgressMonitor;

/**
 *
 * @author Ariel
 */
public class GitServices {
    
    String PathDirectory = null;
    
    public GitServices(String PathDirectory){
        this.PathDirectory = PathDirectory;
    }
    
    public String CloneRepo(String repoUrl, ProgressMonitor monitor){
        
        Gson gson = new Gson();
        String output;
        
        try {
            
//            ProgressMonitor monitor = new ProgressMonitor(){
//                
//                private int totalTasks;
//                private int completedTasks;
//                private String compObject = "";
//                private int totalSubUnit;
//                
//                private RepoProgress repoProgress;
//                
//                @Override
//                public void start(int totalTasks) {
//                    this.totalTasks = totalTasks;
//                    this.completedTasks = 0;                    
//                }
//
//                @Override
//                public void beginTask(String title, int totalWork) {
//                    compObject = title;
//                    totalSubUnit = totalWork;
//                    System.out.println("Task: " + title + " (" + totalWork + " units)");
//                    
//                    completedTasks = 0;
//                    output = gson.toJson(new RepoProgress(compObject, completedTasks, totalTasks, false));
//                }
//
//                @Override
//                public void update(int completed) {
//                    
//                    completedTasks += completed;
//                  
//                    System.out.println("Progress: " + completedTasks + "/" + totalSubUnit);
//                    output = gson.toJson(new RepoProgress(compObject, completedTasks, totalTasks, false));
//                }
//
//                @Override
//                public void endTask() {
//                    System.out.println("Task completed.");
//                }
//                
//                @Override
//                public boolean isCancelled() {
//                    return false; // Return true if you want to cancel the operation
//                }
//
//                @Override
//                public void showDuration(boolean bln) {
//                    System.out.println("duration" + bln);
//                }
//            };
            
            System.out.println("Clonging url");
            Git.cloneRepository()
                    .setURI(repoUrl)
                    .setDirectory(new File(PathDirectory))
                    .setProgressMonitor(monitor)
                    .call();
            
            
        } catch (GitAPIException ex) {
            ex.printStackTrace();
        }
        
        return "Repository cloned successfully.";
    };
    
}
