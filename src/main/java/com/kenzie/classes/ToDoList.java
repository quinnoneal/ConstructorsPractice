package com.kenzie.classes;

import java.util.ArrayList;

public class ToDoList {
    private String listName;
    private int maxItems;
    private ArrayList<ToDoItem> itemList;

    public ToDoList() {
        this.listName = "";
        this.maxItems = 10;
        this.itemList = new ArrayList<>();
    }

    public ToDoList(String listName, int maxItems) {
        this.listName = listName;
        this.maxItems = maxItems;
        this.itemList = new ArrayList<>();
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public void setItemList(ArrayList<ToDoItem> itemList) {
        this.itemList = itemList;
    }

    public String getListName() {
        return this.listName;
    }

    public int getMaxItems() {
        return this.maxItems;
    }

    public ArrayList<ToDoItem> getItemList() {
        return this.itemList;
    }

}


class ToDoItem {
    private String description;
    private String priority;
    private boolean isDone;

    public ToDoItem() {
        this.description = "";
        this.priority = "";
        this.isDone = false;
    }

    public ToDoItem(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isDone = false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean getIsDone() {
        return isDone;
    }
}
