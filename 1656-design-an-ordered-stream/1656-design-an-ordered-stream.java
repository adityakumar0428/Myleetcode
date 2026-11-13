class OrderedStream {

    String[] arr;
    int ptr;

    public OrderedStream(int n) {
        arr = new String[n+1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;

        List<String> result = new ArrayList<>();

        while (ptr < arr.length && arr[ptr] != null) {
            result.add(arr[ptr]);
            ptr++;
        }

        return result;
    }
}


/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */