package com.kavya.assignment1.employees;

public class Manager extends Employees {

        private int ManagerId;
        private String teams;
        private String dept;


        public int getManagerId() {
                return ManagerId;
        }


        public void setManagerId(int managerId) {
                ManagerId = managerId;
        }


        public String getTeams() {
                return teams;
        }


        public void setTeams(String teams) {
                this.teams = teams;
        }


        public String getDept() {
                return dept;
        }


        public void setDept(String dept) {
                this.dept = dept;
        }


        public void displayManagerInfo() {
                DisplayEmployeeInfo();
                 System.out.println("Manager Id : "+this.ManagerId);
                 System.out.println("Department : "+this.dept);
                 System.out.println("Team Available : "+this.teams);

        }
}