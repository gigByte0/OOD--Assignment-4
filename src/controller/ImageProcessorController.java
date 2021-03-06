package controller;

/**
 * Interface to represent controller for image. Outputs messages to view and performs
 * operation on model.
 */
public interface ImageProcessorController {

  /**
   * Main method which takes in user input and performs command based on
   * specification from user.
   */
  public void promptImageCommands();
}
