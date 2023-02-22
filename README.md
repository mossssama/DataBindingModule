# DataBindingModule
Android DataBinding vs FindViewById with single UI example to test

# **Usage** 
***
[1] **Add the following dataBinding elemnent to build.gradle(ProjectModule)** 

    dataBinding{
        enabled = true
    }
    
![1](https://user-images.githubusercontent.com/92642692/220690563-8e054549-2307-4080-902a-9488856c8f5e.png)
***
[2] **Ensure that all the views in the ViewGroup (you want to use DataBinding with) have IDs**
***
[3] **Go to ViewGroup/Layout ((you want to use DataBinding with) To convert it to DataBinding layout as the following** 
    ![2](https://user-images.githubusercontent.com/92642692/220690804-6d6673ce-d0d4-4876-b1f5-7f8e738ef5f9.png)
     ![3](https://user-images.githubusercontent.com/92642692/220690812-c29e9c80-c5e6-4706-98ff-45160b6bb87a.png)
***
[4] **Substitute this function of your viewGroup/Layout**
        
        setContentView(R.layout.activity_main);
 **With**
        
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
***        
[5]  **Directly use all views using their ids preceeded by the word binding as used [here](https://github.com/mossssama/DataBindingModule/blob/main/DataBinding/app/src/main/java/com/example/databinding/MainActivity.java)**    
***


