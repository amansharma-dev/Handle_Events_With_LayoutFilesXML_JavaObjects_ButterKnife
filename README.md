# Handle Events with LayoutFiles, JavaObjects & ButterKnife.

![](Handle_Events_With_LayoutFilesXML_JavaObjects_ButterKnife_github.gif)

## Introduction

The purpose of this app is to understand and to elaborate how we can handle events using XML layout, java & with Butter Knife which is a open source library.

## Handle View  events in Layout File.

We handle simple events in view components, by adding an attribute in the XML layout file `android:onClick="button_xml"` and then calling the method in the activity `public void button_xml(View view){
}`. The event handler method must receive a view object as its one and only argument. That will make the method recognizable by the framework, and it will be called, when the user clicks on that button.

## Handle events with Java Object.

To handle events in using java object, we have to give the unique signature using id `android:id="@+id/button_java"` to the button in XML layout and get its reference and pass in the ID of the button by calling `Button buttonJava = findViewById(R.id.button_java);` in onCreate method of an activity.
Now, call the method set on click listener :
```
buttonJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            
            }
        });
```

This is the second way to handle events with pure Java code. It always works, but it is a little verbose.

## Handle view events with Butter Knife.

Getting references to view objects, and setting up event handlers, takes a lot of boilerplate code.

Butter knife is a popular open source library, created by a developer named Jake Wharton.

To add the ButterKnife library go to : 
> Gradle Scripts
>> build.gradle(Module:app)

In `dependencies { }` add these two dependencies with whatever is the most recent version.

   ```
   implementation 'com.jakewharton:butterknife:8.5.1'
   annotationProcessor 'com.jakewharton:butterknife-compiler:8.5.1'
   ```

Example 1 :-

Now, in Main Activity above onCreate method add this code :

```
 @BindView(R.id.button_butter_knife_1)
    Button button_One;
```

and on onCreate method :

```
        button_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           
            }
        });
```

#### There's an even better way of setting up event handlers using butterknife.

Example 2 :-

Above onCreate method : 

```
 @OnClick(R.id.button_butter_knife_2)
    public void butterKnife_Button2Clicked(){
       
    }
```

#### Note :- Always remember to declare this line of code `ButterKnife.bind(this);` while working with ButterKnife.

# Thank You.
