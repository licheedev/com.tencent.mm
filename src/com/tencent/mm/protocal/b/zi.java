package com.tencent.mm.protocal.b;

public final class zi
  extends com.tencent.mm.at.a
{
  public String jbd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (jbd != null) {
        paramVarArgs.d(1, jbd);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (jbd == null) {
        break label174;
      }
    }
    label174:
    for (paramInt = a.a.a.b.b.a.e(1, jbd) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], iTR);
        for (paramInt = com.tencent.mm.at.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.at.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        a.a.a.a.a locala = (a.a.a.a.a)paramVarArgs[0];
        zi localzi = (zi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        }
        jbd = maU.readString();
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.zi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */