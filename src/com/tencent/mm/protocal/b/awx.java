package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class awx
  extends alq
{
  public int dzm;
  public String dzn;
  public LinkedList jOY = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (jHj == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (jHj != null)
      {
        paramVarArgs.cj(1, jHj.kn());
        jHj.a(paramVarArgs);
      }
      paramVarArgs.ci(2, dzm);
      if (dzn != null) {
        paramVarArgs.d(3, dzn);
      }
      paramVarArgs.d(4, 1, jOY);
      return 0;
    }
    if (paramInt == 1) {
      if (jHj == null) {
        break label450;
      }
    }
    label450:
    for (paramInt = a.a.a.a.ch(1, jHj.kn()) + 0;; paramInt = 0)
    {
      int i = paramInt + a.a.a.a.cg(2, dzm);
      paramInt = i;
      if (dzn != null) {
        paramInt = i + a.a.a.b.b.a.e(3, dzn);
      }
      return paramInt + a.a.a.a.c(4, 1, jOY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        jOY.clear();
        paramVarArgs = new a.a.a.a.a(paramVarArgs, iTR);
        for (paramInt = alq.a(paramVarArgs); paramInt > 0; paramInt = alq.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        if (jHj != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        awx localawx = (awx)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dd();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (boolean bool = true; bool; bool = ((dd)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, alq.a((a.a.a.a.a)localObject2))) {}
            jHj = ((dd)localObject1);
            paramInt += 1;
          }
        case 2: 
          dzm = maU.jC();
          return 0;
        case 3: 
          dzn = maU.readString();
          return 0;
        }
        jOY.add(maU.readString());
        return 0;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.awx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */