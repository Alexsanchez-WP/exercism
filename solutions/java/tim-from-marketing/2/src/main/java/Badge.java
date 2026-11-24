class Badge {
    public String print(Integer id, String name, String department) {
        String data = "";
        data += id == null ? "" : "[" + id.toString() + "] - ";
        data += name.trim();
        data += department == null ? " - OWNER" : " - " + department.toUpperCase();
        return data; 
    }
}