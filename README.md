# Assignment 2
Here you can read about requirments and etc. about the assignment
## ArrayList
### 1
**`void add(T el, int index)` function**
<br><br>
**Definition:** *Inserts the specified element at the specified position in this list.*
<br><br>
**Solving:**
```java
public void add(Object el, int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index == size){
            increaseLength();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = el;
        size++;
    }

```
### 2
**`void clean()` function**
<br><br>
**Definition:** *Removes all of the elements from this list.*
<br><br>
**Solving:**
```java
public void clear(){
        for(int i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
    }
```
### 3
**`boolean contains(Object el)` function**
<br><br>
**Definition:** *Returns true if this list contains the specified element.*
<br><br>
**Solving:**
```java
public boolean contains(Object el){
        boolean doesContain = true;
        for(int i = 0; i < size; i++){
            if(array[i] == el){
                doesContain = false;
                break;
            }
        }
        return doesContain;
    }
```
### 4
**`T get(int index)` function**
<br><br>
**Definition:** *Returns the element at the specified position in this list.*
<br><br>
**Solving:**
```java
public T get(int index){
        return (T) array[index];
    }
```

