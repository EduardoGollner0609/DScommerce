/* eslint-disable @typescript-eslint/no-explicit-any */
export function update(inputs: any, name: string, newValue: any) {
  return { ...inputs, [name]: { ...inputs[name], value: newValue } };
}
