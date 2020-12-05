/*
 * package trycatch;
 * 
 * public class trycatch {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * public void rightClick(WebElement element) { try { Actions action = new
 * Actions(driver).contextClick(element); action.build().perform();
 * 
 * System.out.println("Sucessfully Right clicked on the element"); } catch
 * (StaleElementReferenceException e) {
 * System.out.println("Element is not attached to the page document " +
 * e.getStackTrace()); } catch (NoSuchElementException e) {
 * System.out.println("Element " + element + " was not found in DOM " +
 * e.getStackTrace()); } catch (Exception e) { System.out.println("Element " +
 * element + " was not clickable " + e.getStackTrace()); } }
 * 
 * @AfterClass public void tearDown() { driver.quit(); } }
 * 
 * }
 */