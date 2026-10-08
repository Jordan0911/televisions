/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisions;

/**
 *
 * @author colombo.jordan
 */
public class television {
    String model;
    int width;
    boolean smart;
    int channel=0;
    int volume=0;
    public television( String model,int width,boolean smart,int channel,int volume)
    {
        this.model=model;
        this.width=width;
        this.smart=smart;
        this.channel=channel;
        this.volume=volume;

    }
    public void Increase_channel(int channel)
    {        
    channel++;   
    }
    public void Decrease_channel(int channel)
    {        
    channel--;   
    }
    public void Modify_channel(int channel,int new_channel)
    {        
    channel=new_channel;   
    }
    public void Increase_volume(int volume)
    {        
    volume++;   
    }
     public void Decrease_volume(int volume)
    {        
    volume--;   
    }
}
