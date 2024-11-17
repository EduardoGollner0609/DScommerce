/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable @typescript-eslint/no-unused-vars */

import Select from "react-select";

export default function FormSelect(props: any) {
  const {
    validation,
    invalid = "false",
    dirty = "false",
    onTurnDirty,
    ...selectProps
  } = props;

  function handleBlur() {
    onTurnDirty(props.name);
  }

  return (
    <Select
      onBlur={handleBlur}
      {...selectProps}
      data-invalid={invalid}
      data-dirty={dirty}
    />
  );
}
