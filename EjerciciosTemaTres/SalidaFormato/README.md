# ANSI escape codes

[ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code) can be printed to a shell to as instructions.
The below is a list of codes I have used often in my CLI programs and I find myself looking up over and over again.

A great article about it can be found [here](https://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html).

## Content

- [Colors](#colors)
- [Styles](#styles)
- [Cursor movements](#cursor-movements)
- [Screen](#screen)

## Colors

### Font color

#### 8 Colors

| code         | description        |
| ------------ | ------------------ |
| `\u001b[30m` | Black font color   |
| `\u001b[31m` | Red font color     |
| `\u001b[32m` | Green font color   |
| `\u001b[33m` | Yellow font color  |
| `\u001b[34m` | Blue font color    |
| `\u001b[35m` | Magenta font color |
| `\u001b[36m` | Cyan font color    |
| `\u001b[37m` | White font color   |

#### 16 Colors

| code           | description               |
| -------------- | ------------------------- |
| `\u001b[30;1m` | Bright Black font color   |
| `\u001b[31;1m` | Bright Red font color     |
| `\u001b[32;1m` | Bright Green font color   |
| `\u001b[33;1m` | Bright Yellow font color  |
| `\u001b[34;1m` | Bright Blue font color    |
| `\u001b[35;1m` | Bright Magenta font color |
| `\u001b[36;1m` | Bright Cyan font color    |
| `\u001b[37;1m` | Bright White font color   |

#### 256 colors

| code                          | description                                                      |
| ----------------------------- | ---------------------------------------------------------------- |
| `\u001b[38;5;` + n + `m ` + n | Standard font color where `n` can be a number between 0-7        |
| `\u001b[38;5;` + n + `m ` + n | High intensity font color where `n` can be a number between 8-15 |
| `\u001b[38;5;` + n + `m ` + n | Rainbow font color where `n` can be a number between 16-231      |
| `\u001b[38;5;` + n + `m ` + n | Gray font color where `n` can be a number between 232-255        |

### Background colors

#### 8 Colors

| code         | description              |
| ------------ | ------------------------ |
| `\u001b[40m` | Black background color   |
| `\u001b[41m` | Red background color     |
| `\u001b[42m` | Green background color   |
| `\u001b[43m` | Yellow background color  |
| `\u001b[44m` | Blue background color    |
| `\u001b[45m` | Magenta background color |
| `\u001b[46m` | Cyan background color    |
| `\u001b[47m` | White background color   |

#### 16 Colors

| code           | description                     |
| -------------- | ------------------------------- |
| `\u001b[40;1m` | Bright Black background color   |
| `\u001b[41;1m` | Bright Red background color     |
| `\u001b[42;1m` | Bright Green background color   |
| `\u001b[43;1m` | Bright Yellow background color  |
| `\u001b[44;1m` | Bright Blue background color    |
| `\u001b[45;1m` | Bright Magenta background color |
| `\u001b[46;1m` | Bright Cyan background color    |
| `\u001b[47;1m` | Bright White background color   |

#### 256 colors

| code                          | description                                                            |
| ----------------------------- | ---------------------------------------------------------------------- |
| `\u001b[48;5;` + n + `m ` + n | Standard background color where `n` can be a number between 0-7        |
| `\u001b[48;5;` + n + `m ` + n | High intensity background color where `n` can be a number between 8-15 |
| `\u001b[48;5;` + n + `m ` + n | Rainbow background color where `n` can be a number between 16-231      |
| `\u001b[48;5;` + n + `m ` + n | Gray background color where `n` can be a number between 232-255        |

## Styles

| code        | description      |
| ----------- | ---------------- |
| `\u001b[0m` | Reset all styles |
| `\u001b[1m` | Bold             |
| `\u001b[4m` | Underline        |
| `\u001b[7m` | Reversed         |

## Cursor movements

| code                          | description                                      |
| ----------------------------- | ------------------------------------------------ |
| `\u001b[` + n + `A`           | Move Up by `n` rows                              |
| `\u001b[` + n + `B`           | Move Down by `n` rows                            |
| `\u001b[` + n + `C`           | Move Right by `n` columns                        |
| `\u001b[` + n + `D`           | Move Left by `n` columns                         |
| `\u001b[` + n + `E`           | Move cursor to beginning of line, `n` lines down |
| `\u001b[` + n + `F`           | Move cursor to beginning of line, `n` lines up   |
| `\u001b[` + n + `G`           | Move cursor to column `n`                        |
| `\u001b[` + n + `;` + m + `H` | Move cursor to row `n` column `m`                |
| `\u001b[{s}`                  | Save the current cursor position                 |
| `\u001b[{u}`                  | Restore the cursor to the last saved position    |

## Screen

| code        | description                               |
| ----------- | ----------------------------------------- |
| `\u001b[0J` | clears from cursor until end of screen    |
| `\u001b[1J` | clears from cursor to beginning of screen |
| `\u001b[2J` | clears entire screen                      |
| `\u001b[0K` | clears from cursor to end of line         |
| `\u001b[1K` | clears from cursor to start of line       |
| `\u001b[2K` | clears entire line                        |
