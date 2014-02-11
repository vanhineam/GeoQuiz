package com.kronsby.android.geoquiz;

/**
 * Created by adam on 2/10/14.
 */
public class TrueFalse
{
  private int mQuestion;

  private boolean mTrueQuestion;

  public TrueFalse(int question, boolean trueQuestion)
  {
    mQuestion = question;
    mTrueQuestion = trueQuestion;

  }

  public boolean ismTrueQuestion()
  {
    return mTrueQuestion;
  }

  public void setmTrueQuestion(boolean mTrueQuestion)
  {
    this.mTrueQuestion = mTrueQuestion;
  }

  public int getmQuestion()
  {
    return mQuestion;
  }

  public void setmQuestion(int mQuestion)
  {
    this.mQuestion = mQuestion;
  }
}
