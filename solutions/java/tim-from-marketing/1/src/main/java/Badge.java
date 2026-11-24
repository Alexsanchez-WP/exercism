class Badge {
    public String print(Integer id, String name, String department) {
        String[] data;
        data[0] = id.intValue()? "" : "[" + id.toString() + "]";
        data[1] =  name.trim();
        data[2] = department.equals(null) ? "OWNER" : department.toUpperCase();
        return String.join('-', data); 
    }
}
