// this is
package com.kavya.assignment.employees;

public class Developer extends Employees{
        private int developerId;
        private String name;
        private double salary;
        private String projectId;
        private int securitykey;
        public int getDeveloperId() {
                return developerId;
        }

        public void setDeveloperId(int developerId) {
                this.developerId = developerId;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public double getSalary() {
                return salary;
        }
        public void setSalary(double salary) {
                this.salary = salary;
        }
        public String getProjectId() {
                return projectId;
        }
        public void setProjectId(String projectId) {
                this.projectId = projectId;
        }
        public int getSecuitykey() {
                return securitykey;
        }
        public void setSecuitykey(int secuitykey) {
                this.securitykey = secuitykey;
        }

        public void displayManagerInfo() {
                // TODO Auto-generated method stub

        }


}