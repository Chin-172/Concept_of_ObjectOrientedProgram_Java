# Inheritance

> Object can be a specialized version of another object. The kind of relationship is know as the "is-a", and this is modeled with a technique known as **inheritance** in OOP.

:::info
In oop languages , classes can be derived from other classes , and these derived classes we called as a **subclass** , the class from which its derived is called as a **superclass(base class)**.
:::

## Creating Subclass
In order to create a subclass of another class , we will use the **extends** clause in the class declaration. As a subclass , the class inherits member variables and methods from its superclass. Class can choose to hide variables or override methods inherited from its superclass.
![](https://i.imgur.com/B7hStqr.png)

## Override
Sometimes , we want to change and modify the content within the father method , we have to do **override** in the child class. In order to do so , a new method definition is placed in the derived class definition.
![](https://i.imgur.com/EdqMLAY.png)


## Final Modifier
If the modifier **Final** is placed before the definition of a **method**, then *that method may not be overriden in a derived class*. At the same meaning with **class**, the class with Final tag means that *may not be used as a base class* , the class can't be inheritance from another class. 
![](https://i.imgur.com/93gBibx.png)


Branch : **Inheritance**
- *Digimon.java*
- *Hospital.java*
- *Monster.java*
- *App.java*

---
Last Edited on: 10 January 2022