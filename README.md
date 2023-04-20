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

