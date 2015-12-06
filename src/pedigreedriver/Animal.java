
package pedigreedriver;

/**
 *
 * @author David Heywood
 * Date: December 6, 2015
 */
abstract class Animal {
    private String regNum;
    private String animalName;
    private int dayBorn;
    private int monthBorn;
    private int yearBorn;
    private String gender;
    private String sireRegNum;
    private String damRegNum;
    private int cScore;
    
    private Animal() {        
    }
    
    public Animal(String regNum, String animalName, int dayBorn, int monthBorn, int yearBorn, String gender,
            String sireRegNum, String damRegNum) {
        this.regNum = regNum;
        this.animalName = animalName;
        this.dayBorn = dayBorn;
        this.monthBorn = monthBorn;
        this.yearBorn = yearBorn;
        this.gender = gender;
        this.sireRegNum = sireRegNum;
        this.damRegNum = damRegNum;        
    }

    /**
     * @return the regNum
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * @return the animalName
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * @return the dayBorn
     */
    public int getDayBorn() {
        return dayBorn;
    }

    /**
     * @return the monthBorn
     */
    public int getMonthBorn() {
        return monthBorn;
    }

    /**
     * @return the yearBorn
     */
    public int getYearBorn() {
        return yearBorn;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the sireRegNum
     */
    public String getSireRegNum() {
        return sireRegNum;
    }

    /**
     * @return the damRegNum
     */
    public String getDamRegNum() {
        return damRegNum;
    }

    /**
     * @return the cScore
     */
    public int getcScore() {
        return cScore;
    }

    /**
     * @param regNum the regNum to set
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /**
     * @param animalName the animalName to set
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     * @param dayBorn the dayBorn to set
     */
    public void setDayBorn(int dayBorn) {
        this.dayBorn = dayBorn;
    }

    /**
     * @param monthBorn the monthBorn to set
     */
    public void setMonthBorn(int monthBorn) {
        this.monthBorn = monthBorn;
    }

    /**
     * @param yearBorn the yearBorn to set
     */
    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param sireRegNum the sireRegNum to set
     */
    public void setSireRegNum(String sireRegNum) {
        this.sireRegNum = sireRegNum;
    }

    /**
     * @param damRegNum the damRegNum to set
     */
    public void setDamRegNum(String damRegNum) {
        this.damRegNum = damRegNum;
    }

    /**
     * @param cScore the cScore to set
     */
    public void setcScore(int cScore) {
        this.cScore = cScore;
    }    
}
