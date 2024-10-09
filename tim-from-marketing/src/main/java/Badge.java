class Badge {
    public String print(Integer id, String name, String department) {
        if(id == null && department !=null){
            return name + " - " + department.toUpperCase();
        }

        if(department == null){
            if(id == null){
                return name + " - OWNER";
            }
            return "[" + id + "] - " + name + " - OWNER";
        }
        return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }
}
