package com.thoughtworks.DDF.Arr

import com.thoughtworks.DDF.EvalCase

case class ArrEC[A, B]() extends EvalCase[A => B] {
  override type ret = forward[A, B]
}