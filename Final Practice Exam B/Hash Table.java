class SolutionHashTable {
 public Entry[] table;
 public int capacity;

 /**
  * Constructs a new HashTable.
  *
  * Capacity of the hash table can not be 0 or negative.
  *
  * @param capacity
  *     to be used as capacity of the table.
  * @throws IllegalArgumentException
  *     if the input capacity is invalid.
  */
 public SolutionHashTable(int capacity) {
   if(capacity <= 0){
     throw new IllegalArgumentException();
   }else{
     this.table = new Entry[capacity];
     this.capacity = capacity;
     // for(int i = 0 ; i < table.length ; i ++){
     //   table[i] = null;
     // }
   }
 }

 /**
  * Add a new Entry to the hash table,
  * uses linear probing to deal with collisions.
  *
  * Returns false, if the key is null or the table is full.
  *
  * @param key
  *     String representing the key of the entry.
  * @param value
  *     String representing the value of the entry.
  * @return true iff entry has been added successfully, else false.
  */
 public boolean put(String key, String value) {
   if(key == null){
     return false;
   }else{
     int h = this.hash(key);
     // int k = 1;

     // if(table[h] == null){
     //   table[h] = new Entry(key, value);
     //   return true;
     // }

     // while(table[h] != null && k <= capacity){
     //   // in case the spot is defunct it can be reused
     //   if(table[h].getKey() == null && table[h].getValue()== null){
     //     table[h] = new Entry(key, value);
     //     return true;
     //   }
     //   h = (h+1) % capacity;
     //   k++;
     // }

     // if(table[h] == null){
     //   table[h] = new Entry(key, value);
     //   return true;
     // }

     // if(k > capacity){
     //   return false;
     // }

     // table[h] = new Entry(key, value);
     // return true;
     for(int i = 0 ; i < capacity ; i++){
       Entry en = table[h];
       if(en == null || (en.getKey()== null && en.getValue()==null) || en.getKey().equals(key)){
         table[h] = new Entry(key, value);
         return true;
       }
       h = (h+1) % capacity;
     }
     return false;
   }
 }

 /**
  * Retrieve the value of the entry associated with this key.
  *
  * Returns null, if the key is null.
  *
  * @param key
  *     String representing the key of the entry to look for.
  * @return value of the entry as String iff the entry with this key is found in the hash table, else null.
  */
 public String get(String key) {
   if(key == null){
     return null;
   }

   int h = this.hash(key);
   int k = 1;

   while(table[h] != null && k <= capacity){
     if(table[h].getKey() != null && table[h].getKey().equals(key)){
       return table[h].getValue();
     }
     h = (h+1)%capacity;
     k++;
   }

   return null;
 }

 /**
  * Remove the entry associated with this key from the hash table.
  *
  * Returns false, if the key is null.
  *
  * @param key
  *     String representing the key of the entry to remove.
  * @return true iff the entry has been successfully removed, else false.
  */
 public boolean remove(String key) {
   if(key == null){
     return false;
   }else{

     int h = this.hash(key);
     int k = 1;

     while(table[h] != null && k <= capacity){
       if(table[h].getKey() != null && table[h].getKey().equals(key)){
         this.setDefunct(h);
         return true;
       }
       h = (h+1)%capacity;
       k++;
     }

     return false;
   }
 }

 /**
  * Takes as input an index and sets the entry in that location as defunct.
  *
  * @param index
  *     The index of the spot that is defunct.
  */
 public void setDefunct(int index) {
   this.table[index] = new Entry(null, null);
 }

 /**
  * Hashes a string representing a key.
  *
  * @param key
  *     String that needs to be hashed.
  * @return the hashcode of the string, modulo the capacity of the HashTable.
  */
 public int hash(String key) {
   return Math.abs(key.hashCode()) % capacity;
 }
}
