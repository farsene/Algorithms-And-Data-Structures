class ETHHash extends HashTable {
  public ETHHash(int size) {
    super(size);
  }

  @Override
  public int hash(String item) {
    // TODO
  }
}

class GNUCPPHash extends HashTable {
  public GNUCPPHash(int size) {
    super(size);
  }

  @Override
  public int hash(String item) {
    // TODO
  }
}

class GNUCC1Hash extends HashTable {
  public GNUCC1Hash(int size) {
    super(size);
  }

  @Override
  public int hash(String item) {
    // TODO
  }
}

class HashCodeHash extends HashTable {
  public HashCodeHash(int size) {
    super(size);
  }

  @Override
  public int hash(String item) {
    // TODO
  }
}
//class ETHHash extends HashTable {
//  public ETHHash(int size) {
//    super(size);
//  }
//
//  @Override
//  public int hash(String item) {
//    if(item == null){
//      return 0;
//    }
//    int bi = 1;
//    for(int i = 0 ; i <item.length(); i++){
//      bi = (int)(item.charAt(i))*((bi % 257) + 1);
//    }
//    return bi%this.getCapacity();
//  }
//}
//
//class GNUCPPHash extends HashTable {
//  public GNUCPPHash(int size) {
//    super(size);
//  }
//
//  @Override
//  public int hash(String item) {
//    if(item == null){
//      return 0;
//    }
//    int b0 = 0, bi = 0;
//    for(int i = 0 ; i < item.length() ; i++){
//      bi = 4*b0 + (int)(item.charAt(i));
//      b0 = bi;
//    }
//    // return  (bi & 0x1F)%this.getCapacity();
//    bi = (bi << 1) >>> 1;
//    return bi%this.getCapacity();
//  }
//}
//
//class GNUCC1Hash extends HashTable {
//  public GNUCC1Hash(int size) {
//    super(size);
//  }
//
//  @Override
//  public int hash(String item) {
//    if(item == null){
//      return 0;
//    }
//    int b0 = item.length(), bi = 0;
//    for(int i = 0 ; i < item.length() ; i++){
//      bi = 613*b0 + (int)(item.charAt(i));
//      b0 = bi;
//    }
//    // return (bi & 0x3FFFFFFF)%this.getCapacity();
//    bi = (bi << 2) >>> 2;
//    return bi%this.getCapacity();
//  }
//}
//
//class HashCodeHash extends HashTable {
//  public HashCodeHash(int size) {
//    super(size);
//  }
//
//  @Override
//  public int hash(String item) {
//    if(item == null){
//      return 0;
//    }
//    return Math.abs(item.hashCode())%this.getCapacity();
//  }
//}
////
