interface Table {
	/**
	 * @param index
	 *            to find the string of.
	 * @return the string at the given index in the table.
	 */
	public String getString(int index);

	/**
	 * @return The size of the table.
	 */
	public int size();
}

class Solution extends MyHashTable {

	public Solution(String[] table) {
		super(table);
	}

	/**
	 * Does a linear probe of the hashtable.
	 *
	 * @param msg
	 *            to find in the table.
	 * @param hash
	 *            hash of msg.
	 * @return the index the string is found at or -1 if it is not in there.
	 */
	public int linearProbe(String msg, int hash) {
		return -1;
	}

	/**
	 * Does a hashing probe of the hashtable.
	 *
	 * @param msg
	 *            to find in the table.
	 * @param hash1
	 *            hash1 of msg.
	 * @param hash2
	 *            hash2 of msg.
	 * @return the index the string is found at or -1 if it is not in there.
	 */
	public int hashProbe(String msg, int hash1, int hash2) {
		return -1;
	}
}
//interface Table {
//	/**
//	 * @param index
//	 *            to find the string of.
//	 * @return the string at the given index in the table.
//	 */
//	public String getString(int index);
//
//	/**
//	 * @return The size of the table.
//	 */
//	public int size();
//}
//
//class Solution extends MyHashTable {
//
//	public Solution(String[] table) {
//		super(table);
//	}
//
//	/**
//	 * Does a linear probe of the hashtable.
//	 *
//	 * @param msg
//	 *            to find in the table.
//	 * @param hash
//	 *            hash of msg.
//	 * @return the index the string is found at or -1 if it is not in there.
//	 */
//	public int linearProbe(String msg, int hash) {
//	  if(this.getString(hash).equals(msg)){
//	    return hash;
//	  }else{
//	    int k =1;
//	    hash = (hash + 1)%this.size();
//	    while(k < this.size() && !this.getString(hash).equals(msg) ){
//	      hash = (hash + 1)%this.size();
//	      k++;
//	    }
//	    if(k < this.size()){
//	      return hash;
//	    }
//	    return -1;
//	  }
//	}
//
//	/**
//	 * Does a hashing probe of the hashtable.
//	 *
//	 * @param msg
//	 *            to find in the table.
//	 * @param hash1
//	 *            hash1 of msg.
//	 * @param hash2
//	 *            hash2 of msg.
//	 * @return the index the string is found at or -1 if it is not in there.
//	 */
//	public int hashProbe(String msg, int hash1, int hash2) {
//		if(this.getString(hash1).equals(msg)){
//	    return hash1;
//	  }else{
//	     int k =1;
//	    hash1 = (hash1 + hash2 +1)%this.size();
//	    while(!this.getString(hash1).equals(msg) && k < this.size()){
//	      hash1 = (hash1 + hash2 +1)%this.size();
//	      k++;
//	    }
//	    if(k < this.size()){
//	      return hash1;
//	    }
//	    return -1;
//	  }
//	}
//}
////
